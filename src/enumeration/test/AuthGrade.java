package enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;

    private final String descripttion;

    AuthGrade(int level, String descripttion) {
        this.level = level;
        this.descripttion = descripttion;
    }

    public int getLevel() {
        return level;
    }

    public String getDescripttion() {
        return descripttion;
    }
}
