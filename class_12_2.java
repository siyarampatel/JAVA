//Instagram Profile
class Instagram{
    private String accountName = "Danish_zehen_01";
    private int follower = 146576;
    private int following = 400;

    public void getAccountName(){
        System.out.println(accountName);
    }
    public void getFollower(){
        System.out.println(follower);
    }
    public void getFollowing(){
        System.out.println(following);
    }
}

class class_12_2{ 
    public static void main(String [] args){
        Instagram i = new Instagram();
        i.getAccountName();
        i.getFollower();
        i.getFollowing();
    }
}