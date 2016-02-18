package org.metadatacenter.cedar.orgmodel.model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class User {
  @Id
  @GeneratedValue
  private Long id;

  private String externalId;
  private String name;
  private String primaryEmail;
  private boolean enabled;

  //private Set<Organization> organizations;

  // if mappedBy not present, link table will be generated.
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "owner")
  @Fetch(FetchMode.SELECT)
  private Set<Folder> ownedFolder;
  //private Set<Group> groups;
}
