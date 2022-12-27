
package external.client.generated;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "RoleWS", targetNamespace = "http://controller.usermanagement.digipay.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RoleWS {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createRole", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.CreateRole")
    @ResponseWrapper(localName = "createRoleResponse", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.CreateRoleResponse")
    @Action(input = "http://controller.usermanagement.digipay.com/RoleWS/createRoleRequest", output = "http://controller.usermanagement.digipay.com/RoleWS/createRoleResponse")
    public void createRole(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Long arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteRole", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.DeleteRole")
    @ResponseWrapper(localName = "deleteRoleResponse", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.DeleteRoleResponse")
    @Action(input = "http://controller.usermanagement.digipay.com/RoleWS/deleteRoleRequest", output = "http://controller.usermanagement.digipay.com/RoleWS/deleteRoleResponse")
    public void deleteRole(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<external.client.generated.Role>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listRoles", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.ListRoles")
    @ResponseWrapper(localName = "listRolesResponse", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.ListRolesResponse")
    @Action(input = "http://controller.usermanagement.digipay.com/RoleWS/listRolesRequest", output = "http://controller.usermanagement.digipay.com/RoleWS/listRolesResponse")
    public List<Role> listRoles();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateRole", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.UpdateRole")
    @ResponseWrapper(localName = "updateRoleResponse", targetNamespace = "http://controller.usermanagement.digipay.com/", className = "external.client.generated.UpdateRoleResponse")
    @Action(input = "http://controller.usermanagement.digipay.com/RoleWS/updateRoleRequest", output = "http://controller.usermanagement.digipay.com/RoleWS/updateRoleResponse")
    public void updateRole(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
