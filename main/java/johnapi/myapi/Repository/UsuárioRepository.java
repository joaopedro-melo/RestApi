package johnapi.myapi.Repository;

import johnapi.myapi.Model.UsuárioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuárioRepository extends CrudRepository<UsuárioModel, Integer> {
}
