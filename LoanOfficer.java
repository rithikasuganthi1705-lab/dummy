/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

class LoanOfficer extends LoanApprover {

    void approveLoan(Loan loan) {
        if (loan.amount <= 50000) {
            System.out.println("Loan Approved");
            System.out.println("Customer Name : " + loan.customerName);
            System.out.println("Approved By : Loan Officer");
            System.out.println("Loan Amount : " + loan.amount);
            System.out.println("Approval Status : Approved");
        } else if (nextApprover != null) {
            nextApprover.approveLoan(loan);
        }
    }
}
