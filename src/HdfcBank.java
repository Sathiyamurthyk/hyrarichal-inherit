public class HdfcBank extends RbiBank{
    public void nameHdfc(){
        System.out.println("Name is john");
    }
    public void aadharHdfc(){
        System.out.println("Aadhar no is 7884638474884");
    }
    public void panHdfc(){
        System.out.println("Pan no is 658447648488");
    }
    public void mobileNo(){
        System.out.println("Mobile no: 9845856765");
    }

    public static void main(String[] args) {
        HdfcBank h=new HdfcBank();
        h.accountNum();
        h.ifscCode();
        h.nameHdfc();
        h.aadharHdfc();
        h.panHdfc();
        h.mobileNo();
    }
}
