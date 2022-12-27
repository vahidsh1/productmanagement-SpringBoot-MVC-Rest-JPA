package com.digipay.controller;

public interface AccessController {

    public Boolean checkAccess(String userNationaID, String operationType);
}
