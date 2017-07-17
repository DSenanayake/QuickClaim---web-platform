/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Deeptha Senanayake
 */
public interface Claim {

    public static final int STATUS_SENT = 1;
    public static final int STATUS_INSPECTING = 2;
    public static final int STATUS_COMPLETED = 3;
    public static final int STATUS_DELETED = 4;
    public static final int STATUS_DENIED = 5;

}
