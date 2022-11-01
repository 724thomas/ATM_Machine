public class Users {

    public static User[] users = new User[]{};
    public static User user;


    //모든 아이디와 패스워드 출력
    public static void showUsersAndPassWords(){
        for(User user:users){
            System.out.print("아이디: " + user.getId());
            System.out.println(" 비밀번호: " + user.getPassword());
        }
    }
    //아이디 패스워드가 일치? true : false
    public static boolean checkUserIdAndPassword(String Id, String Pass){
        for(User user:users){
            if (user.getId().equals(Id) && user.getPassword().equals(Pass)){
                System.out.println("아이디 비밀번호 일치");
                return true;
            }
        }
        System.out.println("아이디와 비밀번호를 확인해주세요.");
        return false;
    }
    //아이디 존재? true : false
    public static boolean checkUserIdExists(String Id){
        for(User user:users){
            if (user.getId().equals(Id)){
                System.out.println(Id + " 아이디가 이미 존재합니다.");
                return true;
            }
        }
        System.out.println(Id + " 아이디가 존재하지 않습니다.");
        return false;
    }

    public static void addUser(User newUser){
        User[] tempUsers = new User[users.length+1];
        for(int i=0; i<users.length; i++){
            tempUsers[i] = users[i];
        }
        tempUsers[users.length] = newUser;
        users=tempUsers;
    }

    public static User getUserFromId(String userId){
        for(User user:users){
            if (user.getId().equals(userId)){
                return user;
            }
        }
        return null;
    }
}
