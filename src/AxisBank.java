public class AxisBank extends RbiBank {
    public void aadharAxis(){
        System.out.println("Aadhar no is 6479954321");
    }
    public void panAxis(){
        System.out.println("Pan card no is 5596482");
    }
    public void nameAxis(){
        System.out.println("Name is suresh");
    }
    public void mobileAxis(){
        System.out.println("Mobile no is 6889674432");
    }

    public static void main(String[] args) {
        AxisBank a=new AxisBank();
        a.accountNum();
        a.ifscCode();
        a.nameAxis();
        a.aadharAxis();
        a.panAxis();
        a.mobileAxis();
    }
}
