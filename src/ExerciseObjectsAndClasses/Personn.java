package ExerciseObjectsAndClasses;

    public class Personn {

        private String name;
        private String id;
        private int age;


        public Personn(String name, String id, int age) {

            this.name = name;
            this.id = id;
            this.age = age;
        }


        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }
    }
