class Badge {
    public String print(Integer id, String name, String department) {
        if(department != null){
            department = department.toUpperCase();
        }
        String message = "";
        if (id != null && name != null && department != null){
            message = "["+id+"] - "+name+" - "+department;
        }
        if (id == null){
            message = name+" - "+department;
        }
        if (department == null){
            message = "["+id+"] - "+name+" - OWNER";
        }
        if (id == null && department == null){
            message = name+" - OWNER";
        }
        return message;
        
    }
}
