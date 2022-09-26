public class IciciBank extends RbiBank{
    public void nameIcici(){
        System.out.println("Name is sathiya");
    }
    public void aadharNoicici(){
        System.out.println("Adhar no is 672846839937");
    }
    public void pannoIcici(){
        System.out.println("Pan no is 754738633");
    }
    public void mobileIcici(){
        System.out.println("mobile no 69987836");
    }

    public static void main(String[] args) {
        IciciBank i=new IciciBank();
        i.accountNum();
        i.ifscCode();
        i.nameIcici();
        i.aadharNoicici();
        i.pannoIcici();
        i.mobileIcici();
    }
}
