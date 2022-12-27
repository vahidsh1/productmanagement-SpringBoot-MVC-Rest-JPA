package com.digipay.controller;

import external.client.generated.Permission;
import external.client.generated.User;
import external.client.generated.UserWS;
import external.client.generated.UserWSImplService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccessControllerImpl implements AccessController {

    private boolean accessFlag=false;
    private String operationType;

    @Override
    public Boolean checkAccess(String userNationalID, String operationType) {

        UserWSImplService userWSImplService = new UserWSImplService();
        UserWS userWSImplPort = userWSImplService.getUserWSImplPort();
        User user = userWSImplPort.listAUser(userNationalID);
        List<Permission> permissionList = user.getRole().getPermissions();
        for (Permission permission : permissionList) {
            accessFlag = (permission.getPermissionTitle()).equals(operationType);
            if (accessFlag)
                break;
        }
        return accessFlag;
    }
}



