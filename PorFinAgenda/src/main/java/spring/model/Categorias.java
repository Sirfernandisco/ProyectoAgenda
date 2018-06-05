package spring.model;
// Generated 05-jun-2018 19:38:38 by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categorias generated by hbm2java
 */
@Entity
@Table(name = "categorias", catalog = "agenda")
public class Categorias implements java.io.Serializable {

	private Integer idcategorias;
	private String nombre;
	private String descripcion;
	private Set<Empleados> empleadoses = new HashSet<Empleados>(0);

	public Categorias() {
	}

	public Categorias(String nombre) {
		this.nombre = nombre;
	}

	public Categorias(String nombre, String descripcion, Set<Empleados> empleadoses) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empleadoses = empleadoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcategorias", unique = true, nullable = false)
	public Integer getIdcategorias() {
		return this.idcategorias;
	}

	public void setIdcategorias(Integer idcategorias) {
		this.idcategorias = idcategorias;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias")
	public Set<Empleados> getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set<Empleados> empleadoses) {
		this.empleadoses = empleadoses;
	}

}
