import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminDeleteComponent } from './admin-delete.component';

describe('AdminDeleteComponent', () => {
  let component: AdminDeleteComponent;
  let fixture: ComponentFixture<AdminDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
