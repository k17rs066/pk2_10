class Book{
    private String title;
    private String pub;


     void set(String title,String pub){
        this.title=title;
        this.pub=pub;
    }

    String info(){
        return  "「"+title+"」、"+pub;
    }
}

class Magazine extends Book{
    private String sale;
    void set(String title,String pub,String sale){
        set(title,pub);
        this.sale=sale;
    }
    String info(){
        return super.info()+"("+sale+"発売)";
    }
}

class Ex10_1{
    public static void main(String[] args) {
        Book b1=new Book();
        Magazine m1=new Magazine();
        Magazine m2=new Magazine();
        b1.set("知的生産の技術","岩波新書");
        m1.set("スピリッツ","小学館","毎週月曜日");
        m2.set("月刊PHP","PHP","毎月10日");
        System.out.println(b1.info());
        System.out.println(m1.info());
        System.out.println(m2.info());

        
    }
}