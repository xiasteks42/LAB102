package projectmanager.projectManagerAdmin;

import java.util.Date;

public class Manager extends Employee {
   private  Date promotionDate;


    Manager(String id, String name,String empOfficeNo,String empOfficePhone,Date promotionDate) {
        super(id,name,empOfficeNo,empOfficePhone);

}
@Override

public String toString(){
    
    return super.toString()+"\t"+this.promotionDate;
}

//setters&getters
private Date getPromotionDate() {
    return promotionDate;
}

private void setPromotionDate(Date promotionDate) {
    this.promotionDate = promotionDate;
}
}
