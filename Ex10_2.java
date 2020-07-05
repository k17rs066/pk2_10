class Ex10_2{
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        Character c1=new Character();
        Character c2=new Character();
        Singer s1=new Singer();
        Singer s2=new Singer();


        p1.set("松香台介","福岡市出身");
        p2.set("丘かすみ","直方市出身");
        c1.set("マッコイ","探偵","エリア51");
        c2.set("真城最高","漫画家","バクマン");
        s1.set("西野カナ");
        s2.set("福山雅治");

        Person p[] ={ p1,p2,c1,c2,s1,s2};

        for(int i=0;i<p.length;i++){
            p[i].show();
        }

    }
}

class Person{
    private String name;
    private String profile;

    void set(String name,String profile){
        this.name=name;
        this.profile=profile;
    }

    void show(){
        System.out.println(name+"("+profile+")");
    }
}


class Character extends Person{
    private String title;

    void set(String name,String profile,String title){
        set(name,profile);
        this.title=title;
    }

    void show(){
        super.show();
        System.out.println("「"+title+"」に登場");
    }
}
class Singer extends Person{
    void set(String name){
        set(name,"歌手");
    }
}