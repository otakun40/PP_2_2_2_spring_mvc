package Service;

import Model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListByCount(int count);
}
