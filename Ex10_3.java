public class Ex10_3 {
    public static void main(String[] args) {
        TeaCup t1=new TeaCup();
        t1.set("ダージリン","インド",250);

        TeaCup t2=new TeaCup();
        t2.set("ウバ","スリランカ",300);
        t2.pour(170);

        WaterCup w3=new WaterCup();
        w3.set("六甲",180);

        Cup c[]={t1,t2,w3};
        for(int i=0;i<c.length;i++){
            c[i].pour(200);
            c[i].show();
        }
    }
}

class Cup{
    private String name;
    private int capacity;
    private int volume;

    void set(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    void pour(int volume){
        this.volume=this.volume+volume;
        
    }

    void show(){
        System.out.println(capacity+"cc");
        if(volume>capacity){
            System.out.println("※"+name+"が"+(volume-capacity)+"cc溢れました。");
        }
    }

    String getName(){
        return name;
    }


}

class TeaCup extends Cup{
    private String place;

    void set(String name,String place,int capacity){
        set(name,capacity);
        this.place=place;
    }

    void show(){
        System.out.print(getName()+"（"+place+"産）：");
        super.show();
    }
}

class WaterCup extends Cup{
    private String place;
    void set(String place, int capacity ){
        super.set("水",capacity);
        this.place=place;
    }
    void show() {
        System.out.print(getName()+"（"+place+"産）：");
        super.show();
    }
}