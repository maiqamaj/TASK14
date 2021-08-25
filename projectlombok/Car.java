package jo.seocndstep.projectlombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Car {

	private String carMake;
	private String model;
	private int year;
	private double price;

}
