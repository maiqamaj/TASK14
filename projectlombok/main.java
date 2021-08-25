package jo.seocndstep.projectlombok;

import java.util.HashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Camry", 2020, 28.500);
		Car car2 = new Car("Nissan", "Murano", 2007, 7.500);

		Car car3 = new Car();
		car3.setCarMake("Nissan");
		car3.setModel("altima");
		car3.setYear(2001);
		car3.setPrice(4.900);

		Car car4 = new Car("Toyota", "Camry", 2020, 28.500);

		Set<Car> cars = new HashSet<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		for (Car i : cars) {
			System.out.println(i);
		}
		System.out.println(cars.size());

	}

}
