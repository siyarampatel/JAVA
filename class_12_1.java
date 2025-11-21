class youtube{
    private int subscriberCount = 100000;
    private String channelName = "Siyaram";

    public void getName(){
        System.out.println(channelName);
    }
    public void getSubsriberCount(){
        System.out.println(subscriberCount);
    }
    public void subscribe(){
        subscriberCount++;
        System.out.println(subscriberCount);
    }
    public void unSubscribe(){
        subscriberCount--;
        System.out.println(subscriberCount);
    }
}

class class_12_1{
    public static void main(String [] args){
        youtube y = new youtube();
        y.getName();
        y.getSubsriberCount();
        y.subscribe();
        y.unSubscribe();
    }
}