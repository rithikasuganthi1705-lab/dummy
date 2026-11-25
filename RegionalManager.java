/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

class RegionalManager extends LoanApprover {

    void approveLoan(Loan loan) {
        System.out.println("Loan Approved");
        System.out.println("Customer Name : " + loan.customerName);
        System.out.println("Approved By : Regional Manager");
        System.out.println("Loan Amount : " + loan.amount);
        System.out.println("Approval Status : Approved");
    }
}