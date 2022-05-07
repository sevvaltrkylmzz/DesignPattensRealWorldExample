package project2;

public class Chef implements DessertFactory {
    public void bakeCookie(String foodName) {
        Cookie cookie = createCookie(foodName);
        try {
            cookie.makeCookie();
        } catch (Exception e) {
            System.out.println("We don't have " + foodName + ".");
        }

    }

    public void bakeCake(String foodName) {
        Cake cake = createCake(foodName);
        try {
            cake.makeCake();
        } catch (Exception e) {
            System.out.println("We don't have " + foodName + ".");
        }

    }

    public Cake createCake(String type) {
        if (type.equalsIgnoreCase("carrot cake")) {
            return new CarrotCake();
        } else if (type.equalsIgnoreCase("black forest cake")) {
            return new BlackForestCake();
        } else if (type.equalsIgnoreCase("birthday cake")) {
            return new BirthdayCake();
        }
        return null;
    }

    public Cookie createCookie(String type) {
        if (type.equalsIgnoreCase("chocolate chip cookie")) {
            return new ChocolateChipCookie();
        } else if (type.equalsIgnoreCase("ginger bread cookie")) {
            return new GingerBreadCookie();
        } else if (type.equalsIgnoreCase("peanut butter cookie")) {
            return new PeanutButterCookie();
        }
        return null;

    }
}
