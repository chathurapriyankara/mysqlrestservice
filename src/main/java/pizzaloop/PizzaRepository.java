package pizzaloop;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaRepository extends CrudRepository<PizzaDetails, Integer>{
    /*
    * Find pizza by name
    */
    List<PizzaDetails> findByPizzaId(Integer id);
}
