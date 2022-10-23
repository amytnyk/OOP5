package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }

    public double getPrice() {
        return packs.stream().mapToDouble(FlowerPack::getPrice).sum();
    }
}

