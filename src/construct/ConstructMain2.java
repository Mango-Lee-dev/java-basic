package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("User1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("User1", 15);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 나이: " + member.grade);
        }
    }
}
