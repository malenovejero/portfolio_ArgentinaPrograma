import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpEditableComponent } from './exp-editable.component';

describe('ExpEditableComponent', () => {
  let component: ExpEditableComponent;
  let fixture: ComponentFixture<ExpEditableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExpEditableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExpEditableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
