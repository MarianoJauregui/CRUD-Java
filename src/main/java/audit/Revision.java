package audit;

import config.CustomRevisionListener;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.envers.*;

import lombok.Data;


@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
public class Revision implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="revision_seq")
	@SequenceGenerator (
		name = "revision_seq",
		sequenceName = "rbac.seq_revision_id"
	)
	@RevisionNumber
	private int id;
	
	@Column(name="REVISION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@RevisionTimestamp
	private Date date;

}
