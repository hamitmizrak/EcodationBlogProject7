package tutorials.javase;

// Javada 1 tane public class vardır(inner class hariç).
// Javada static class yoktur.(inner class hariç).

//nesneler ++++++....
//class +++++...
//paketler ++++...
//projeler

//POJO: field+getter and setter
//BEAN: POJO+constructor
public class _19_WhatIsClass {

    //field
    private String name;
    private String surname;
    //Overloading: aşırı yüklemek
    // parametre sayısı veya değişkenleri farklıysa biz buna overloading.

    //kurucu metotlar: constructor
    //parametresiz constructor
    public  _19_WhatIsClass(){
    }

    //parametreli constructor
    public _19_WhatIsClass(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // getter:getirmek  and setter:değiştirmek
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
