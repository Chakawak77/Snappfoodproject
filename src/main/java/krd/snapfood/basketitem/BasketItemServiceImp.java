package krd.snapfood.basketitem;


import krd.snapfood.basket.BasketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BasketItemServiceImp implements BasketItemService {

    private final BasketItemRepository repository;


    @Override
    public BasketItem save(BasketItem basketItem) {
        return repository.save(basketItem);
    }

    @Override
    public BasketItem update(BasketItem basketItem) {
        BasketItem updateBasketItem=getById(basketItem.getId());
        updateBasketItem.setCount(basketItem.getCount());
        updateBasketItem.setIcon(basketItem.getIcon());
        updateBasketItem.setPrice(basketItem.getPrice());
        updateBasketItem.setTitle(basketItem.getTitle());

        return repository.save(updateBasketItem);
    }

    @Override
    public void delete(Long id) {
     getById(id);
     repository.deleteById(id);
    }

    @Override
    public BasketItem getById(Long id) {
        Optional<BasketItem> optionalBasketItem=repository.findById(id);
        if (optionalBasketItem.isEmpty())
            throw  new RuntimeException("Not Found");

        return optionalBasketItem.get();
    }
}