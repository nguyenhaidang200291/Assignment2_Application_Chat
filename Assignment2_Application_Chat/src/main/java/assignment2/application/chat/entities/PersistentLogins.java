package assignment2.application.chat.entities;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persistent_logins")
public class PersistentLogins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "series")
    private String series;
   
    @NotEmpty
    @Column(name = "username")
    private String userName;
    
    @NotEmpty
    @Column(name = "token")
    private String token;
    
    @NotEmpty
    @Column(name = "last_used")
    private Timestamp lastUsed;

    
}
