package krd.snapfood.basket;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BasketServiceImp implements BasketService{

    private  final BasketRepository repository;

    @Override
    public Basket save(Basket basket) {
        return repository.save(basket);
    }

    @Override
    public Basket update(Basket basket) {
        Basket updateBasket=getById(basket.getId());
        updateBasket.setTitle(basket.getTitle());
        updateBasket.setPaidPrice(basket.getPaidPrice());
        return save(updateBasket);
    }

    @Override
    public void delete(Long id) {
      getById(id);
      repository.deleteById(id);
    }

    @Override
    public Basket getById(Long id) {
        Optional<Basket> optionalBasket=repository.findById(id);
        if (!optionalBasket.isPresent())
            throw new RuntimeException("Not Found");

        return optionalBasket.get();
    }

    @Override
    public List<Basket> findAll() {
        return (List<Basket>) repository.findAll();
    }

    @Override
    public List<Basket> findAllSupplier_Id(Long supplierId) {
        return repository.findAllByAddress_Id(supplierId);
    }

    @Override
    public List<Basket> findAllAddress_Id(Long addressId) {
        return  repository.findAllByAddress_Id(addressId);
    }
}
