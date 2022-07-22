package br.com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dio.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
