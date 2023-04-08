package projectmanager.projectManagerAdmin;

import java.util.Date;

public class Manager extends Employee {
    private Date promotionDate;

    Manager(String id, String name, String empOfficeNo, String empOfficePhone) {
        super(id, name, empOfficeNo, empOfficePhone);

    }

    @Override

    public String toString() {

        // return super.toString() + "\t" + this.promotionDate + "\n";
        return "Manager\t" + this.getEmpID() + "\t" + this.getEmpName() + "\t" + this.getEmpOfficeNo() + "\t"
                + this.getEmpOfficePhone() + "\n";

    }

    // setters&getters
    private Date getPromotionDate() {
        return promotionDate;
    }

    private void setPromotionDate(Date promotionDate) {
        this.promotionDate = promotionDate;
    }
}
