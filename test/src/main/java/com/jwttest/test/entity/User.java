
package com.jwttest.test.entity;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author madusha mihiranga
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private @NonNull Long id;
    @Column(name = "password")
    @JsonIgnore
    private @NonNull String password;
    @Column(name = "username")
    private @NonNull String username;
    
}
