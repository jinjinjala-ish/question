package nested.nested;

public class NestedOuter {
        private static int outClassValue = 1;
        private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근할 수 없음
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있음. private도 접근 가능
            System.out.println(outClassValue);
        }
    }

}
