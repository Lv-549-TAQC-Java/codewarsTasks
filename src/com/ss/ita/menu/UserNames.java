package com.ss.ita.menu;

public enum UserNames {
   KHRYSTYNA(1L,"Khrystyna"),
    HANNA(2L, "Hanna"),
    VADYM(3L, "Vadym"),
    MIKE(4L, "Mike"),
    MARIA(5L, "Maria"),
    ANDRII(6L, "Andrii"),
    NASTIA(7L, "Nastia"),
    YURII(8L, "Yurii");

   private final Long id;
   private final String name;
   UserNames(Long id, String name){
       this.name = name;
       this.id = id;
   }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public static UserNames getById(Long id){
       for(UserNames user : values()){
           if (user.id.equals(id)) {
               return user;
           }
       }
       return null;

    }
}
