package org.library.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;

import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Audited(targetAuditMode = NOT_AUDITED)
@Entity
@Table(name = "book_genre")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookGenre extends PanacheEntity {
    private String name;
    private String description;
}
