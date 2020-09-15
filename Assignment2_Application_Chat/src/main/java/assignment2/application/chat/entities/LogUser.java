package assignment2.application.chat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "log_user")
public class LogUser implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5418870729187124894L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    
    @Column(name = "email")
    private String email;
  
    @Column(name = "time_login")
    private Date timeLogin;
    
    @Column(name = "time_logout")
    private Date timeLogout;
    
    @Lob
    @Column(name = "screenshot")
    private byte[] screenshot;
    
}
