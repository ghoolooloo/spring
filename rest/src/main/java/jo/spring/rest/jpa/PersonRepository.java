package jo.spring.rest.jpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 在运行时，Spring Data REST 将自动创建这个接口的一个实现。
 * 然后，根据 @RepositoryRestResource 指导 Spring MVC 去生成一个 “/people” 的 RESTful 端点。
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	List<Person> findByLastName(@Param("name") String name);
}