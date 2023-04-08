package projectmanager.projectManagerAdmin;

import utils.Globals.*;
public class Developer extends Employee {
   private  programmingLanguages[] topRatedLanguages;

private Developer(String id,String name,String empOfficeNo,String empOfficePhone, programmingLanguages[] languages ) {
    
    super(id,name,empOfficeNo,empOfficePhone);
    this.topRatedLanguages = languages;
}

@Override 
   public String toString(){
    return super.toString()+"\t"+this.topRatedLanguages;
   }


//setters&getters   
   private programmingLanguages[] getTopRatedLanguages() {
    return topRatedLanguages;
}

private void setTopRatedLanguages(programmingLanguages[] topRatedLanguages) {
    this.topRatedLanguages = topRatedLanguages;
}
   

}
