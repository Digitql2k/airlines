class Customer {
    String name;
    int age;
    String email;
    String password;
    String number;
    String country;

    public Customer(String name, int age, String email, String password, String number, String country){
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
        this.password = password;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String Email){
        this.email = email;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

}
