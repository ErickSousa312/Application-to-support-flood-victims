package spring.domain.donatedItems;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryDonatedItems extends JpaRepository<DonatedItems, Integer> {
    void createDonatedItems();
}
