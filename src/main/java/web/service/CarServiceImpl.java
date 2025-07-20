package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class CarServiceImpl implements CarService {
    static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("model1", 1111111, "AAA111"));
        carList.add(new Car("model2", 2222222, "BBB222"));
        carList.add(new Car("model3", 3333333, "CCC333"));
        carList.add(new Car("model4", 4444444, "DDD444"));
        carList.add(new Car("model5", 5555555, "EEE555"));
    }

    @Override
    public List<Car> getCarList(int count) {
        return IntStream.range(0, carList.size())
                .filter(l -> l < count)
                .mapToObj(carList::get)
                .toList();
    }
}
