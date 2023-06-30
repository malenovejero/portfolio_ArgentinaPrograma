import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EdEditableComponent } from './ed-editable.component';

describe('EdEditableComponent', () => {
  let component: EdEditableComponent;
  let fixture: ComponentFixture<EdEditableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EdEditableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EdEditableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
