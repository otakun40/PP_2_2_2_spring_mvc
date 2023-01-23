package app.dao;

import app.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getListByCount(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "S600", 500));
        cars.add(new Car("BMW", "X7", 600));
        cars.add(new Car("Lada", "Vesta", 104));
        cars.add(new Car("Lamborghini", "Gallardo", 800));
        cars.add(new Car("Porsche", "911", 800));
        if (count >= 0 && count < 5) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
