package org.metadatacenter.cedar.orgmodel.model;

import java.util.Set;

public class Organization {
  private long id;
  private String name;
  private Organization parent;

  private Set<User> users;
  private Set<Folder> folders;
}
