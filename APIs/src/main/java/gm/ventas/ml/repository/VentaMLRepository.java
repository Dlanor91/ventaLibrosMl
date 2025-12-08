package gm.ventas.ml.repository;

import gm.ventas.ml.model.VentaML;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaMLRepository extends JpaRepository<VentaML, Integer> {
}
