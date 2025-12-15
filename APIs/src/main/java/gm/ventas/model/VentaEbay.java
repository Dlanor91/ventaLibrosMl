package gm.ventas.model;

import gm.ventas.model.enums.Estados;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "ventas_ebay")
public class VentaEbay extends BaseEntity {

    @Email
    @NotBlank
    @Column(name = "usuario_email", length = 50, nullable = false)
    private String usuarioEmail;

    @NotBlank
    @Column(name = "isbn_libro", length = 20, nullable = false)
    private String isbnLibro;

    @NotNull
    @Positive
    @Column(nullable = false)
    private Integer cantidad;

    @Column(name = "fecha_venta", nullable = false)
    private LocalDateTime fechaVenta;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_venta", nullable = false)
    private Estados estadoVenta;

    @PrePersist
    public void prePersist() {
        this.fechaVenta = LocalDateTime.now();
        this.estadoVenta = Estados.EN_PROCESO;
    }
}
