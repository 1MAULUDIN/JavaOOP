/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author GIE
 */
public class Company {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public class President {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
       
        public String getCompany() {
            return Company.this.name;
        }
    }
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("FIRA");

        Company.President president = company.new President();
        president.setName("Egi Purnama Mauludin");
        
        System.out.println(company.getName());
        System.out.println(president.getCompany());
        System.out.println(president.getName());
    }
    
}
