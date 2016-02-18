package org.metadatacenter.cedar.orgmodel.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Folder {
  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @Fetch(FetchMode.SELECT)
  @JoinColumn(name = "owner_user_id",
      referencedColumnName = "id",
      unique = false,
      nullable = true,
      insertable = true,
      updatable = true
  )
  private User owner;

  //private Set<Organization> organizations;
}
