// AC: Runtime 906 ms Beats 5.08% of users with Java
// Memory 70.56 MB Beats 83.62% of users with Java
// PriorityQueue & inner class sorting.
// T:O(logn), S:O(n)
// 
class FoodRatings {
    HashMap<String, Food> foodInfo;
    HashMap<String, PriorityQueue<Food>> cuisineToFood;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodInfo = new HashMap<>();
        cuisineToFood = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodInfo.put(foods[i], food);
            PriorityQueue<Food> pq = new PriorityQueue<>((a, b) ->
                    !a.rating.equals(b.rating) ? (b.rating - a.rating) : a.name.compareTo(b.name));
            cuisineToFood.putIfAbsent(cuisines[i], pq);
            cuisineToFood.get(cuisines[i]).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        PriorityQueue<Food> pq = cuisineToFood.get(foodInfo.get(food).cuisine);
        pq.remove(foodInfo.get(food));
        foodInfo.get(food).rating = newRating;
        pq.add(foodInfo.get(food));
    }

    public String highestRated(String cuisine) {
        return cuisineToFood.get(cuisine).peek().name;
    }

    static class Food {
        Integer rating;
        String name, cuisine;

        Food(String name, String cuisine, Integer rating) {
            this.rating = rating;
            this.name = name;
            this.cuisine = cuisine;
        }
    }
}
